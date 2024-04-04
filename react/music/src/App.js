import './App.css';
import { useState } from 'react';
import {BrowserRouter, Route, Link, Routes, useLocation, useNavigate} from 'react-router-dom'
function App() {

  let[list, setList] = useState([]);
  
  function add(movie){
    setList([movie, ...list]);
  }
  function remove(num){
    let tmpList = list.filter(item=>item.num !== num);
    setList(tmpList)
  }
  return (
    <BrowserRouter>
    <Nav/>
    <Routes>
      <Route path="/" exact element={<List list={list} add={add} remove={remove}/>} />
      <Route path="/add" exact element={<Add/>} />
    </Routes>
  </BrowserRouter>
  );
}
function List({list, add, remove}){
  
  const location = useLocation();
  let movie = location.state;
  if(movie != null){
    add(movie);
    location.state = null;
  }
  return(
    <div>
      <h1 className="movie_list">Movies</h1>
      <table className='movie_table'>
        <thead className='table_head'>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Genre</th>
            <th>Release Date</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {
            list.map((item)=>{
              return(
                <tr key={item.num}>
                  <td>{item.num}</td>
                  <td>{item.title}</td>
                  <td>{item.artist}</td>
                  <td>{item.genre}</td>
                  <td><button onClick={()=>remove(item.num)}>Delete</button></td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  );
}

function Nav(){
  return(
    <ul className="menu-list">
      <li><Link to="/">List</Link></li>
      <li><Link to="/add">Add New Movie</Link></li>
    </ul>
  )
}

function Add(){
  let[num, setNum] = useState(0);
  let[artist, setArtist] = useState("");
  let[title, setTitle] = useState("");
  let[genre, setGenre] = useState("");

  const numChange = (e) => setNum(e.target.value);
  const artistChange = (e) => setArtist(e.target.value);
  const titleChange = (e) => setTitle(e.target.value);
  const genreChange = (e) => setGenre(e.target.value);
  
  const navigate = useNavigate();

  function addMovie(){
    navigate("/",{
      state : {
        num,
        title,
        artist,
        genre
      }
    })
  }

  return(
    <div className="movie_list">
      <h1>Create Moive</h1>
      <div>
        <input type="text" onChange={numChange} placeholder='Input moive id'/>
      </div>
      <div>
        <input type="text" onChange={artistChange} placeholder='Input moive title'/>
      </div>
      <div>
        <input type="text" onChange={titleChange} placeholder='Input moive genre'/>
      </div>
      <div>
        <span>출시일</span>
        <input type="date" onChange={genreChange}/>
      </div>
      <button onClick={addMovie}>Add Movie</button>
    </div>
  );
}
export default App;

function btnClick(){
    //입력한 제목, 내용, 작성자를 가져옴
    let title = $("#title").val();
    let content = $("#content").val();
    let writer = $("#writer").val();
    //가져온 제목, 내용, 작성자와 번호를 이용해서 객체를 생성
    let num;
    if(!list.length){
        num = 1;
    }else{
        num = parseInt(list[0]["num"] + 1);
    }
    let view = 0;
    let obj = {
        // title : title,
        // content : content,
        // writer : writer
        writer,
        vie,
        content
    }
    if(checkBoard(obj)){
        alert("모든 항목은 필수 항목입니다.");
        return false;
    }
    //생성된 객체를 배열 앞에 추가
    list.unshift(obj);
    //display함수를 호출 : 테이블에 list를 출력하는 함수
    display(list);
    //입력값들을 비워줌
    initForm();
    //return false를 통해 서버로 전송되는 것을 막아줌
    return false;
}


btn.onclick = function(){
    modal.style.display = "none";
    display(list);
}

//리스트에서 num와 게시글 번호를 가진 게시글을 반환하는 함수
function getBoard(list,num){
    for(board of list){
        if(board["num"] == num){
            return board;
        }
    }
    return null;
}

//제목을 클릭하면
function linkClick(){
    $(".modal-box").show();
    let num = $(this).data("num");
    let board = getBoard(list, num);
    if(board){
        ++board["view"];
        let html = 
        `
        <h1>게시글 상세</h1>
        <div class="input-box">
            <label class="label">번호</label>
            <input type="text" name="num" class="input" readonly value="${board["num"]}">
        </div>
        <div class="input-box">
            <label class="label">제목:</label>
            <input type="text" name="title" class="input" readonly value="${board["title"]}">
        </div>
        <div class="input-box">
            <label class="label">작성자:</label>
            <input type="text" name="writer" class="input" readonly value="${board["write"]}">
        </div>
        <div class="input-box">
            <label class="label">조회수:</label>
            <input type="text" name="view" class="input" readonly value="${board["view"]}">
        </div>
        <div class="input-box">
            <label class="label">내용:</label>
            <textarea name="content" rows="10" class="input text-area" readonly>"${board["content"]}"</textarea>
        </div>
        `;
        $(".modal-box .content-box").html(html);
    }else{
        //없는 게시글입니다를 구성해 모달창에 출력
        let html = "<h1>없는 게시글입니다.</h1>"
        $(".modal-box .content-box").html(html);
    }
}

//display 함수
function display(list){
    //list가 비어있으면
    if(list.length){
        let tr = 
        `<tr>
        <th colspan = "4">등록된 게시글이 없습니다.</tj>
        </tr>`;
        $("tbody").html(tr);
        tbody.append(tr);
        return;
    }
    $("tbody").empty();
    for(let i = 0; i<list.length; i++){
        let tr = `<tr>`;
        `<tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>`;
        //tr태그 생성
        //반복문 : list[i] 객체를 반복문으로 속성값을 꺼냄, for in
        for(let key in list[i]){
            console.log(list[i]);
            if(key == "content"){
                continue;
            }
            let obj = list[i];
            if(key != "title"){
                //td태그 생성
                let td = createElement("td", String(obj[key]), {class : key});
                //tr태그에 추가
                tr.append(td);
                tr += ` <td class="${key}">${obj[key]}</td>`;
            }else {
                tr += `
                    <td class="${key}">
                        <a href="#" class="link" data-num="${obj["num"]}">${obj[key]}</a>
                    </td>
                `;
            }
        }   
        tr += `</tr>`;
        //tbody태그에 tr태그를 추가    
        $("tbody").append(tr);  
    }
}

function createElement(tagName, text, attribute){
    let element = document.createElement(tagName);
    if(text){
        let textNode = document.createTextNode(text);
        element.append(textNode);
    }
    if(attributes){
        for(key in attributes){
            let attrNode = document.createAttribute(key);
            attrNode.value = attributes[key];
            element.setAttributeNode(attrNode);
        }
    }
    return element;
}

//게시글에 빈 항목이 있는지 없는지 알려주는 함수
function checkBoard(board){
    if(!board){
        return false;
    }
    if(typeof board != "object"){
        return false;
    }
    //제목체크
    if(!board["title"].trim().length){
        return false;
    }
    //작성자 체크
    if(!board["title"].trim().length){
        return false;
    }
    //내용 체크
    if(!board["title"].trim().length){
        return false;
    }
    return true;
}

//form태그의 입력값들을 초기화하는 함수
function initForm(){
    $(".input").val("");
}

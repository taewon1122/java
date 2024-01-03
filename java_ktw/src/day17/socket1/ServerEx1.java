package day17.socket1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 5006;
		ArrayList<String> list = new ArrayList<String>();
		ServerSocket serverSocket = null;
		String fileName = "src/day17/socket1/chat.txt";
		list = load(fileName);
		
		try {
			//2. 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			//3. 대기
			//4. 요청 수락 후 소켓 객체 생성
			Socket socket = serverSocket.accept();
			//5. 작업
			System.out.println("[연결 성공]");
			//읽어온 채팅 내역을 클라이언트로 전송
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(list);
			oos.flush();
			
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			while(true) {
				String str = ois.readUTF();
				if(str.equals("-1")) {
					break;
				}
				System.out.println(str);
				list.add(str);
			}
			ois.close();
			is.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		save(list, fileName);
	}

	private static void save(ArrayList<String> list, String fileName) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			//람다식의 예외처리는 위 try문의 예외처리와는 별개
			list.stream().forEach(str->{
				try {
					oos.writeUTF(str);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static ArrayList<String> load(String fileName) {
		ArrayList<String> list = new ArrayList<String>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			while(true) {
				list.add(ois.readUTF());
			}
		} catch (IOException e) {
			return list;
		}
	}
}

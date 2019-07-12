package test10network.test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test01main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Network");

		new Thread() {
			public void run() {
				// java.net.*
				HttpURLConnection conn = null;
				BufferedReader br = null;
				try {
					URL url = new URL("http://192.168.1.113/javawork/test10network/src/test/com/temp.txt");
					conn = (HttpURLConnection) url.openConnection();

					System.out.println("conn.getResponseCode() : " + conn.getResponseCode());
					System.out.println("conn.getContentType() : " + conn.getContentType());
					System.out.println("conn.getInputStream() : " + conn.getInputStream());
					System.out.println();

					br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String str;
					String temp = "";// 속도가 느림
					StringBuilder sb = new StringBuilder();
					long startTime = System.currentTimeMillis();
					while ((str = br.readLine()) != null) {
//						System.out.println(str);
//						temp += str;
						sb.append(str);
					}
					System.out.println("time:" + (System.currentTimeMillis() - startTime));
					System.out.println(sb.toString().length());

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (conn != null)
						conn.disconnect();
					if (br != null)
						try {
							br.close();
						} catch (IOException e) {
						}
				}
			};
		}.start();

		System.out.println("end");
	}
}
package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	{ // 초기화 블럭
		list.add(new Music("GoodBye", "박효신"));
		list.add(new Music("술이달다", "에픽하이"));
		list.add(new Music("밥이달다", "강보람"));
	}
	
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title,artist));
		
		
	}
	
	public ArrayList<Music> selectMusic() {
		// 출력문 쓰면 안됨! 출력문은 view에서만 쓸것임.
		return list;
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			} 
		}
		// result = 0(삭제할 곡 찾지 못함) | 1(성공적으로 삭제됨)
		return result;
	}
	
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); // 검색된 Music객체를 차곡차곡 담을 list
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		
		// searchList => 텅 비어있을 수 있음 | 검색된 Music객체들이 담겨있을 수 있음
		return searchList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

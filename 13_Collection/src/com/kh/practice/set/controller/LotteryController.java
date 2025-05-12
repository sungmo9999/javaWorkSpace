package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController { 
	private HashSet<Lottery> lottery = new HashSet();
	private HashSet<Lottery> win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
		
		
	}
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		
		if(result && win != null && !win.isEmpty()) {
			win.remove(l);
		}
		return result;
		
	}
	public HashSet winObject() {
		ArrayList<Lottery> list = new ArrayList(lottery);
		
		if(list.size() <4 ) {
			return null;
		}
		
		while(win.size() <4) {
		int random = new Random().nextInt(list.size()); //(int)(Math.random()* list.size());
		win.add(list.get(random));
		}
		return win;
	}
	public TreeSet sortedWinObject(){ 
		
		winObject();
		
		TreeSet<Lottery> ts = new TreeSet<>(new SortedLottery());
		ts.addAll(win);
		return ts;
	}
	public boolean searchWinner(Lottery l){ 
		
		return win.contains(l);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

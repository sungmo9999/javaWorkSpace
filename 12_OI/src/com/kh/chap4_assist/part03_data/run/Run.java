package com.kh.chap4_assist.part03_data.run;

import com.kh.chap4_assist.part03_data.model.dao.DataDAO;

public class Run {
	public static void main(String[] args) {
		DataDAO  dao = new DataDAO();
		//dao.fileSave();
		dao.fileRead();
	}

}

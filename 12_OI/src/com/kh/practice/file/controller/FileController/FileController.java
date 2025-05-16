package com.kh.practice.file.controller.FileController;

import com.kh.practice.file.model.dao.FileDAO.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean ckeckName(String file) {
		return fd.ckeckName(file);
		
	}
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file ,sb.toString());
		
	}
	public StringBuilder fileOpen (String file) {
		return fd.fileOpen(file);
	}
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
		
	}

}

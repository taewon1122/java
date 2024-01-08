package day20.service;

import java.util.ArrayList;
import java.util.List;

import day20.word.Word;

public interface FileService {
	List<Word> load = new ArrayList<Word>();
	boolean save();
}

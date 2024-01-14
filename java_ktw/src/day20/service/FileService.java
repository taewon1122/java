package day20.service;

import java.util.List;

import day20.word.Word;

public interface FileService {
	List<Word> load(String fileName);

	boolean save(String fileName, List<Word> list);
}

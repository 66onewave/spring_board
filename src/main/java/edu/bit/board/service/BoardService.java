package edu.bit.board.service;

import java.util.List;

import edu.bit.board.page.Criteria;
import edu.bit.board.vo.BoardVO;

public interface BoardService {
    // 리스트 불러오기 처리 함수
	List<BoardVO> getList();
	
	// 글 읽어오기 처리 함수
    BoardVO get(int bid);

    // 수정 처리 함수
    void modify(BoardVO boardVO);

    // 삭제 처리 함수
    void remove(int bid);
    
    // 글 작성 처리 함수
    void writeBoard(BoardVO boardVO);

    // 댓글 처리 함수
    void writeReply(BoardVO boardVO);

    // 조회수 처리 함수
    void upHit(int bid);

    // 페이징 처리 함수
    public int getTotal(Criteria cri);
    public List<BoardVO> getList(Criteria criteria);
}

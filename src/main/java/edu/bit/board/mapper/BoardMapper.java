package edu.bit.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.board.page.Criteria;
import edu.bit.board.vo.BoardVO;

@Mapper
public interface BoardMapper {
	// 리스트 불러오기 처리 함수
    List<BoardVO> getList();
    
    // 글 읽어오기 처리 함수
    BoardVO read(int bid);
    
    // 수정 처리 함수
    void update(BoardVO boardVO);
    
    // 삭제 처리 함수
    void delete(int bid);
    
    // 글 작성 처리 함수
    void insertBoard(BoardVO boardVO);
    
    // 댓글 처리 함수
    void updateShape(BoardVO boardVO);
    void insertReply(BoardVO boardVO);
    
    // 조회수 처리 함수
    void updateHit(int bid);
    
    // 페이징 처리 함수
	int getTotalCount(Criteria cri);
	List<BoardVO> getListWithPaging(Criteria criteria);
}

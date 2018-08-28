package com.netsong7.myapp.persistence;

import java.util.List;

import com.netsong7.myapp.domain.BoardVO;
import com.netsong7.myapp.domain.Criteria;
import com.netsong7.myapp.domain.SearchCriteria;

public interface BoardDAO {

  public void create(BoardVO vo) throws Exception;

  public BoardVO read(Integer bno) throws Exception;

  public void update(BoardVO vo) throws Exception;

  public void delete(Integer bno) throws Exception;

  public List<BoardVO> listAll() throws Exception;

  public List<BoardVO> listPage(int page) throws Exception;

  public List<BoardVO> listCriteria(Criteria cri) throws Exception;

  public int countPaging(Criteria cri) throws Exception;
  
  //use for dynamic sql
  
  public List<BoardVO> listSearch(SearchCriteria cri)throws Exception;
  
  public int listSearchCount(SearchCriteria cri)throws Exception;

}

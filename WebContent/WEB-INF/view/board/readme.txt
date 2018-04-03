--생성할 정보

vo : com.study.board.vo : Board
DAO : com.study.board.dao : BoardDaoJDBC
	+ getBoardCount(Connection conn)			
	+ getBoardList(Connection conn)
	+ getBoard(Connection conn, int bo_no)
	+ insertBoard(Connection conn, Board board)
	+ updateBoard(Connection conn, Board board)  
	
Service : com.study.board.service : BoardServiceImpl
	+ getBoardCount()
	+ getBoardList()
	+ getBoard(int bo_no)
	+ registBoard(Board board)
	+ modifyBoard(board board)
	
WebContent 에 board 폴더 생성
	boardList.jsp 파일 생성 <- 16일차 memberList.jsp 참고해서
	
글등록 완성해 주세요 
	- 등록폼 : 제목, 작성자, 비번, 내용
	- registBoard.jsp에서 board에 사용자 IP를 직접 입력
	- 서비스, dao완성
	

- 상세보기 한번 ㄱㄱ
18장 MVC  패턴 구현

화요일 : 상세 보기 

-------------------------
 1. PagingVO에 페이지 블럭 관련 구현 해보기
 
 
 2. Edit/From 화면에서 "내용" 영역에 있는 것을 위지웍에디터로 바꿔서 구현 
 	네이버, 다음, 섬머노트, ck 에디터 같은
 	
 	
 
 
 
 
 


	

	
	
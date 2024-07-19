package days15;

/**
 * @author dkrkdfla
 * @date 2024. 7. 19.오후 12:26:29
 * @subject		싱글톤
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		//The constructor BoardDAO() is not visible
		//BoardDAO dao = new BoardDAO();
		BoardDAO dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.insert();

		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.update();
		
		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.select();
		
		
	}//main

}//class

//DB연결 + CRUD
//DAO = Data Access Object
class BoardDAO{
	
	private static BoardDAO boardDAO = null;
	
	private BoardDAO() {}
	
	//동기화처리(잠금)
	public synchronized static BoardDAO getInstance() {
		//return new BoardDAO();
		if (boardDAO == null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
	public void insert() {
		System.out.println("DB 추가");
	}
	public void select() {
		System.out.println("DB 선택");
	}
	public void update() {
		System.out.println("DB 수정");
	}
	public void delete() {
		System.out.println("DB 삭제");
	}
	
}











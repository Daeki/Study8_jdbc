package com.iu.s1.region;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iu.s1.util.DBConnector;

public class RegionDAO {
	
	private DBConnector dbConnector;
	
	public RegionDAO() {
		dbConnector = new DBConnector();
	}
	
	//대륙정보 추가
	public int setInsert(RegionDTO regionDTO) throws Exception {
		//1. DB 연결
		Connection con = dbConnector.getConnect();
		
		//java는 기본으로 auto commit 임
		//auto commit 해제
		con.setAutoCommit(false);
		
		//2. SQL Query문 생성
		String sql ="INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES (?, ?)";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 세팅
		st.setLong(1, regionDTO.getRegion_id());
		st.setString(2, regionDTO.getRegion_name());
		
		//5. 최종 전송 후 결과 처리
		int result = st.executeUpdate();
		
		
		//auto commit으로 재설정
		con.setAutoCommit(true);
		
		//6. 자원 해제
		st.close();
		con.close();
		
		return result;
		
	}
	
	//검색조회
	//전체조회
	

}

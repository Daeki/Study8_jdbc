package com.iu.s1.start;

import java.util.List;

import com.iu.s1.department.DepartMentController;
import com.iu.s1.department.DepartmentDAO;
import com.iu.s1.department.DepartmentDTO;
import com.iu.s1.department.DepartmentView;
import com.iu.s1.location.LocationDAO;
import com.iu.s1.location.LocationDTO;
import com.iu.s1.location.LocationView;
import com.iu.s1.region.RegionDAO;
import com.iu.s1.region.RegionDTO;
import com.iu.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
		
		FrontController frontController = new FrontController();
		
		try {
			//frontController.mainStart();
			RegionDAO regionDAO = new RegionDAO();
			RegionDTO regionDTO = new RegionDTO();
			regionDTO.setRegion_id(6L);
			regionDTO.setRegion_name("South Pole");
			
			int result = regionDAO.setInsert(regionDTO);
			
			if(result > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("DB 연동 테스트 끝");
	}

}

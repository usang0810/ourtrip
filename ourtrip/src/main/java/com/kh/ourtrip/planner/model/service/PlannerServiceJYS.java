package com.kh.ourtrip.planner.model.service;

import java.util.List;

import com.kh.ourtrip.planner.model.vo.AreaName;
import com.kh.ourtrip.planner.model.vo.PlannerCard;
import com.kh.ourtrip.planner.model.vo.PlannerMember;

public interface PlannerServiceJYS {

	/** 회원 수정중인 플래너 수 조회용 Service
	 * @param memberNo
	 * @return updatePlannerCount
	 * @throws Exception
	 */
	public abstract int updatePlannerCount(int memberNo) throws Exception;

	/** 회원이 참여하고있는 플래너 번호 목록 조회용 Service
	 * @param memberNo
	 * @return plannerNoList
	 * @throws Exception
	 */
	public abstract List<PlannerMember> selectPlannerMember(int memberNo) throws Exception;

	/** 수정중인 플래너 목록 조회용 Service
	 * @param memberNo
	 * @return uPlannerList
	 * @throws Exception
	 */
	public abstract List<PlannerCard> updatePlannerList(int memberNo) throws Exception;

	/** 완료된 플래너 목록 조회용 Service
	 * @param memberNo
	 * @return cPlannerList
	 * @throws Exception
	 */
	public abstract List<PlannerCard> completePlannerList(int memberNo) throws Exception;

	/** 플래너 지역이름 조회용 Service
	 * @param noList
	 * @return areaNames
	 * @throws Exception
	 */
	public abstract List<AreaName> selectAreaNames(List<Integer> noList) throws Exception;



}

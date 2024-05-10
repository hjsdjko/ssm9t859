package com.dao;

import com.entity.KechengdingyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengdingyueVO;
import com.entity.view.KechengdingyueView;


/**
 * 课程订阅
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:31:40
 */
public interface KechengdingyueDao extends BaseMapper<KechengdingyueEntity> {
	
	List<KechengdingyueVO> selectListVO(@Param("ew") Wrapper<KechengdingyueEntity> wrapper);
	
	KechengdingyueVO selectVO(@Param("ew") Wrapper<KechengdingyueEntity> wrapper);
	
	List<KechengdingyueView> selectListView(@Param("ew") Wrapper<KechengdingyueEntity> wrapper);

	List<KechengdingyueView> selectListView(Pagination page,@Param("ew") Wrapper<KechengdingyueEntity> wrapper);
	
	KechengdingyueView selectView(@Param("ew") Wrapper<KechengdingyueEntity> wrapper);
	
}

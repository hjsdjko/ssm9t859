package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengdingyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengdingyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengdingyueView;


/**
 * 课程订阅
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:31:40
 */
public interface KechengdingyueService extends IService<KechengdingyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengdingyueVO> selectListVO(Wrapper<KechengdingyueEntity> wrapper);
   	
   	KechengdingyueVO selectVO(@Param("ew") Wrapper<KechengdingyueEntity> wrapper);
   	
   	List<KechengdingyueView> selectListView(Wrapper<KechengdingyueEntity> wrapper);
   	
   	KechengdingyueView selectView(@Param("ew") Wrapper<KechengdingyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengdingyueEntity> wrapper);
   	
}


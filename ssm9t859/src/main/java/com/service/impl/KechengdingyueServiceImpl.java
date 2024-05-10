package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KechengdingyueDao;
import com.entity.KechengdingyueEntity;
import com.service.KechengdingyueService;
import com.entity.vo.KechengdingyueVO;
import com.entity.view.KechengdingyueView;

@Service("kechengdingyueService")
public class KechengdingyueServiceImpl extends ServiceImpl<KechengdingyueDao, KechengdingyueEntity> implements KechengdingyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengdingyueEntity> page = this.selectPage(
                new Query<KechengdingyueEntity>(params).getPage(),
                new EntityWrapper<KechengdingyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengdingyueEntity> wrapper) {
		  Page<KechengdingyueView> page =new Query<KechengdingyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengdingyueVO> selectListVO(Wrapper<KechengdingyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengdingyueVO selectVO(Wrapper<KechengdingyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengdingyueView> selectListView(Wrapper<KechengdingyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengdingyueView selectView(Wrapper<KechengdingyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

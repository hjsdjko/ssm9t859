package com.entity.view;

import com.entity.KechengdingyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程订阅
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:31:40
 */
@TableName("kechengdingyue")
public class KechengdingyueView  extends KechengdingyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengdingyueView(){
	}
 
 	public KechengdingyueView(KechengdingyueEntity kechengdingyueEntity){
 	try {
			BeanUtils.copyProperties(this, kechengdingyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

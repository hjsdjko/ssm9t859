package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 15:31:40
 */
public class KechengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程分类
	 */
	
	private String kechengfenlei;
		
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 任课老师
	 */
	
	private String renkelaoshi;
		
	/**
	 * 课程价格
	 */
	
	private String kechengjiage;
		
	/**
	 * 预览视频
	 */
	
	private String yulanshipin;
		
	/**
	 * 课程介绍
	 */
	
	private String kechengjieshao;
				
	
	/**
	 * 设置：课程分类
	 */
	 
	public void setKechengfenlei(String kechengfenlei) {
		this.kechengfenlei = kechengfenlei;
	}
	
	/**
	 * 获取：课程分类
	 */
	public String getKechengfenlei() {
		return kechengfenlei;
	}
				
	
	/**
	 * 设置：课程图片
	 */
	 
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
	}
				
	
	/**
	 * 设置：任课老师
	 */
	 
	public void setRenkelaoshi(String renkelaoshi) {
		this.renkelaoshi = renkelaoshi;
	}
	
	/**
	 * 获取：任课老师
	 */
	public String getRenkelaoshi() {
		return renkelaoshi;
	}
				
	
	/**
	 * 设置：课程价格
	 */
	 
	public void setKechengjiage(String kechengjiage) {
		this.kechengjiage = kechengjiage;
	}
	
	/**
	 * 获取：课程价格
	 */
	public String getKechengjiage() {
		return kechengjiage;
	}
				
	
	/**
	 * 设置：预览视频
	 */
	 
	public void setYulanshipin(String yulanshipin) {
		this.yulanshipin = yulanshipin;
	}
	
	/**
	 * 获取：预览视频
	 */
	public String getYulanshipin() {
		return yulanshipin;
	}
				
	
	/**
	 * 设置：课程介绍
	 */
	 
	public void setKechengjieshao(String kechengjieshao) {
		this.kechengjieshao = kechengjieshao;
	}
	
	/**
	 * 获取：课程介绍
	 */
	public String getKechengjieshao() {
		return kechengjieshao;
	}
			
}

package com.dao;

import com.entity.KehuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehuxinxiVO;
import com.entity.view.KehuxinxiView;


/**
 * 客户信息
 * 
 * @author 
 * @email 
 * @date 2023-03-03 20:21:29
 */
public interface KehuxinxiDao extends BaseMapper<KehuxinxiEntity> {
	
	List<KehuxinxiVO> selectListVO(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
	
	KehuxinxiVO selectVO(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
	
	List<KehuxinxiView> selectListView(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);

	List<KehuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
	
	KehuxinxiView selectView(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
	

}

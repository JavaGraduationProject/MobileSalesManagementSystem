package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanxinxiView;


/**
 * 订单信息
 *
 * @author 
 * @email 
 * @date 2023-03-03 20:21:29
 */
public interface DingdanxinxiService extends IService<DingdanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanxinxiVO> selectListVO(Wrapper<DingdanxinxiEntity> wrapper);
   	
   	DingdanxinxiVO selectVO(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
   	
   	List<DingdanxinxiView> selectListView(Wrapper<DingdanxinxiEntity> wrapper);
   	
   	DingdanxinxiView selectView(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DingdanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DingdanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DingdanxinxiEntity> wrapper);



}


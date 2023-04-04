package com.xm.store.controller;


import com.xm.store.pojo.District;
import com.xm.store.service.IDistrictService;
import com.xm.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("districts")
public class DistrictController extends BaseController {
    @Autowired
    private IDistrictService districtService;

    @GetMapping({"", "/"})
    //@RequestMapping(method={RequestMethod.GET})
    public JsonResult<List<District>> getByParent(String parent) {
        List<District> data = districtService.getByParent(parent);
        return new JsonResult<>(OK, data);
    }
}

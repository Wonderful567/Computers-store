package com.xm.store.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePojo {
    private String created_user;
    private Date created_time;
    private String modified_user;
    private Date modified_time;
}

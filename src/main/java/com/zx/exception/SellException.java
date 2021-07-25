package com.zx.exception;

import com.zx.enums.ResultEnum;
import org.omg.PortableInterceptor.INACTIVE;

public class SellException  extends  RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }
}

package com.ua.crow.cprint.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BasicObject implements Serializable {
    @Serial
    private static final long serialVersionUID = 5492907173720823734L;
    protected String id;

}

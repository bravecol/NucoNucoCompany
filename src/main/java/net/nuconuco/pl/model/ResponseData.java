package net.nuconuco.pl.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResponseData {
    private String serial;
    private Object data;
}
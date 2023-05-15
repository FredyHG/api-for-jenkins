package dev.fredyhg.api.requests;

import lombok.Builder;
import lombok.Data;

@Data
public class CoursePostRequest {

    private String name;

    private String desc;

}

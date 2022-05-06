package com.ad.SpringBoot_Rest_lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student {
    private int id;
    private String fname;
    private String lname;
}

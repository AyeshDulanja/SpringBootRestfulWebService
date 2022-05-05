package com.ad.SpringBoot_Rest_lombok.Model;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Student {
    private int id;
    private String fname;
    private String lname;
}

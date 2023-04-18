package org.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TPC_FTE")
@DiscriminatorValue("full_time")
public class FullTimeEmp extends Employee{

    private int fix_sal,extra_no_of_hrs,extra_hrs_sal;

    public FullTimeEmp(int id, String name,int fix_sal,int extra_hrs_sal, int extra_no_of_hrs) {
        super(id, name);
        this.fix_sal=fix_sal;
        this.extra_hrs_sal =extra_hrs_sal;
        this.extra_no_of_hrs = extra_no_of_hrs;
    }
}


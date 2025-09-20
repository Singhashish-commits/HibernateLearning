package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "alien_table")
public class Alien {
    @Id
    private int aid;
    @Column(name = "name")
    private String aname;
    @Column(name = "technology")
    private String tech;
//    @Column("system_config");
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

        public int getAid() {
            return this.aid;
        }
        public void setAid(int aid) {
            this.aid = aid;
        }
        public String getAname() {
            return this.aname;
        }
        public void setAname(String aname) {
            this.aname = aname;
        }
        public String getTech() {
            return this.tech;
        }
        public void setTech(String tech) {
            this.tech = tech;
        }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}

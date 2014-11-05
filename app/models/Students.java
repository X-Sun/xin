package models;

import javax.persistence.*;
import play.libs.Codec;

@Entity
@Table(name = "Students")
public class Students {
	@Id
	public String id;

    @Column (name = "stu_name")
	public String name;//名字

    @Column(name = "number")
	public int number;// 学号
	
	@Column (name = "sex")
	public String sex;//性别
	
	@Column (name = "telephone")
	public int telephone;//电话
	
	@Column (name = "dormitory")
	public String dormitory;//宿舍

public Students(String name , int number ,String sex ,int telephone, String dormitory)
	{ 
		//TODO 自动生成的构造函数存根
		this.id = Codec.UUID();
		this.name = name;
		this.number = number;
		this.sex = sex;
		this.telephone = telephone;
		this.dormitory = dormitory;
	}
}
    


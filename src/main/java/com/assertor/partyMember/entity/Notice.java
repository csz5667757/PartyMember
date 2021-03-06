package com.assertor.partyMember.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Notice implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.author
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.public_time
     *
     * @mbggenerated
     */
    private Date publicTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.aritle
     *
     * @mbggenerated
     */
    private String aritle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.source_department
     *
     * @mbggenerated
     */
    private Integer sourceDepartment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.create_user
     *
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.update_user
     *
     * @mbggenerated
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;


}
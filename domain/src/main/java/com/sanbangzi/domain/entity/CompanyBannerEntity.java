package com.sanbangzi.domain.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 公司banner表 */
@Data
@Table(name = "company_banner")
public class CompanyBannerEntity {

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 图片 */
    private String picture;

    /** 链接 */
    private String link;

    /** 类型(1:无链接,2:产品) */
    private Byte type;

    /** 排序 */
    private Byte sort;

    /** 公司id(关联company.id) */
    private Long companyId;

}

package com.jk.mapper;

import com.jk.pojo.SupplierDrug;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QueryDrugByIssuedStatusMapperServer {
    /**
     *  @Select(" select drug_id id,drug_name name,drug_mnemonic_code drugMnemonicCode,drug_another_name" +
     *             " drugAnotherName from drug_drug where drug_name like '%${supplierDrug.name}%'")
     * @param supplierDrug
     * @return
     */

    List<SupplierDrug> QueryDrugByIssuedStatus(@Param("supplierDrug") SupplierDrug supplierDrug);

    /**
     * 修改上下架状态（批量修改）
     * cl
     * @param ids
     */
    void updateIssuedStatus(@Param("ids") String[] ids);
    /**
     * 修改上下架状态（批量修改）
     * cl
     * @param ids
     */
    void updateIssuedStatus2(@Param("ids")String[] ids);

    /**
     * 删除上架商品
     * @param id
     */
    void deleteDrugById(String id);

    /**
     * 回显
     * @param id
     * @return
     */
    List<SupplierDrug> queryDrugById(String id);

    /**
     * 修改已发布商品信息
     * @param supplierDrug
     */
    void updateDrug(SupplierDrug supplierDrug);

    /**
     * 新增发布商品
     * @param supplierDrug
     */
    void saveDrug(SupplierDrug supplierDrug);

    /**
     * 根据推广状态不是未推广查询
     * @param supplierDrug
     * @return
     */
    List<SupplierDrug> QueryDrugBySpreadStatus(@Param("supplierDrug")SupplierDrug supplierDrug);

    /**
     * 根据推广状态是未推广查询
     * @param supplierDrug
     * @return
     */
    List<SupplierDrug> QueryDrugBySpreadStatus2(SupplierDrug supplierDrug);

    /**
     * 批量推广
     * @param ids
     */
    void updateSpread(@Param("ids")String[] ids);
    /**
     * 批量取消推广
     * @param ids
     */
    void updateSpread2(@Param("ids")String[] ids);

    /**
     * 删除已取消推广商品
     * @param id
     */
    void deleteSpreadById(String id);
}

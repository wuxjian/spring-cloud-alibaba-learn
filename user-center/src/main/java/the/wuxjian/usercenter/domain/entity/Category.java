package the.wuxjian.usercenter.domain.entity;

import javax.persistence.*;

@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * 展示的名称
     */
    private String label;

    /**
     * 顺序
     */
    private Short seq;

    /**
     * 1正常0删除
     */
    private String enable;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取name
     *
     * @return name - name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取展示的名称
     *
     * @return label - 展示的名称
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置展示的名称
     *
     * @param label 展示的名称
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取顺序
     *
     * @return seq - 顺序
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * 设置顺序
     *
     * @param seq 顺序
     */
    public void setSeq(Short seq) {
        this.seq = seq;
    }

    /**
     * 获取1正常0删除
     *
     * @return enable - 1正常0删除
     */
    public String getEnable() {
        return enable;
    }

    /**
     * 设置1正常0删除
     *
     * @param enable 1正常0删除
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }
}
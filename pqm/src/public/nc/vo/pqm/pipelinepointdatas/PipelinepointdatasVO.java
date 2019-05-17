package nc.vo.pqm.pipelinepointdatas;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2019-5-17
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class PipelinepointdatasVO extends SuperVO {
	
/**
*����
*/
public java.lang.String pk_pipelinepointdatas;
/**
*����
*/
public java.lang.String pk_group;
/**
*��֯
*/
public java.lang.String pk_org;
/**
*��Ŀ����
*/
public java.lang.String pk_project;
/**
*��Ŀ��֯
*/
public java.lang.String project_org;
/**
*��Ŀ����
*/
public java.lang.String project_code;
/**
*��Ŀ����
*/
public java.lang.String project_name;
/**
*��Ŀ����
*/
public java.lang.String project_class;
/**
*eps
*/
public java.lang.String eps;
/**
*�ɵ����
*/
public java.lang.Integer code;
/**
*�ɵ�����
*/
public java.lang.String name;
/**
*����
*/
public java.lang.String longitude;
/**
*γ��
*/
public java.lang.String latitude;
/**
*�߳�
*/
public java.lang.String elevation;
/**
*���ߵ����
*/
public java.lang.String pk_pipelinepointclass;
/**
*ѹ���ȼ�
*/
public java.lang.String pk_pressuregrade;
/**
*ѹ��MPa
*/
public java.lang.String mpa;
/**
*����
*/
public java.lang.String isline;
/**
*��ע
*/
public java.lang.String memo;
/**
*�ύ��
*/
public java.lang.String creator;
/**
*�ύʱ��
*/
public UFDateTime creationtime;
/**
*����޸���
*/
public java.lang.String modifier;
/**
*����޸�ʱ��
*/
public UFDateTime modifiedtime;
/**
*�Զ�����1
*/
public java.lang.String vdef1;
/**
*�Զ�����2
*/
public java.lang.String vdef2;
/**
*�Զ�����3
*/
public java.lang.String vdef3;
/**
*�Զ�����4
*/
public java.lang.String vdef4;
/**
*�Զ�����5
*/
public java.lang.String vdef5;
/**
*�Զ�����6
*/
public java.lang.String vdef6;
/**
*�Զ�����7
*/
public java.lang.String vdef7;
/**
*�Զ�����8
*/
public java.lang.String vdef8;
/**
*�Զ�����9
*/
public java.lang.String vdef9;
/**
*�Զ�����10
*/
public java.lang.String vdef10;
/**
*�Զ�����11
*/
public java.lang.String vdef11;
/**
*�Զ�����12
*/
public java.lang.String vdef12;
/**
*�Զ�����13
*/
public java.lang.String vdef13;
/**
*�Զ�����14
*/
public java.lang.String vdef14;
/**
*�Զ�����15
*/
public java.lang.String vdef15;
/**
*�Զ�����16
*/
public java.lang.String vdef16;
/**
*�Զ�����17
*/
public java.lang.String vdef17;
/**
*�Զ�����18
*/
public java.lang.String vdef18;
/**
*�Զ�����19
*/
public java.lang.String vdef19;
/**
*�Զ�����20
*/
public java.lang.String vdef20;
/**
*�Զ�����21
*/
public java.lang.String vdef21;
/**
*�Զ�����22
*/
public java.lang.String vdef22;
/**
*�Զ�����23
*/
public java.lang.String vdef23;
/**
*�Զ�����24
*/
public java.lang.String vdef24;
/**
*�Զ�����25
*/
public java.lang.String vdef25;
/**
*�Զ�����26
*/
public java.lang.String vdef26;
/**
*�Զ�����27
*/
public java.lang.String vdef27;
/**
*�Զ�����28
*/
public java.lang.String vdef28;
/**
*�Զ�����29
*/
public java.lang.String vdef29;
/**
*�Զ�����30
*/
public java.lang.String vdef30;
/**
*ʱ���
*/
public UFDateTime ts;


/**
*ʱ���
*/
public static final String TS="ts";
public static final String PK_PIPELINEPOINTDATAS = "pk_pipelinepointdatas";
public static final String PK_GROUP = "pk_group";
public static final String PK_ORG = "pk_org";
public static final String PK_PROJECT = "pk_project";
public static final String CODE = "code";
public static final String NAME = "name";
public static final String LONGITUDE = "longitude";
public static final String LATITUDE = "latitude";
public static final String ELEVATION = "elevation";
public static final String PK_PIPELINEPOINTCLASS = "pk_pipelinepointclass";
public static final String PK_PRESSUREGRADE = "pk_pressuregrade";
public static final String ISLINE = "isline";
public static final String MEMO = "memo";
public static final String CREATOR = "creator";
public static final String CREATIONTIME = "creationtime";
public static final String MODIFIER = "modifier";
public static final String MODIFIEDTIME = "modifiedtime";
public static final String DEF1 = "def1";
public static final String DEF2 = "def2";
public static final String DEF3 = "def3";
public static final String DEF4 = "def4";
public static final String DEF5 = "def5";
public static final String DEF6 = "def6";
public static final String DEF7 = "def7";
public static final String DEF8 = "def8";
public static final String DEF9 = "def9";
public static final String DEF10 = "def10";
public static final String MDID = "d30e91c1-485f-4486-90d9-59d9710039a1";
    
    
/**
* ���� pk_pipelinepointdatas��Getter����.������������
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getPk_pipelinepointdatas() {
return this.pk_pipelinepointdatas;
} 

/**
* ����pk_pipelinepointdatas��Setter����.������������
* ��������:2019-5-17
* @param newPk_pipelinepointdatas java.lang.String
*/
public void setPk_pipelinepointdatas ( java.lang.String pk_pipelinepointdatas) {
this.pk_pipelinepointdatas=pk_pipelinepointdatas;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2019-5-17
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2019-5-17
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.����������֯
*  ��������:2019-5-17
* @return nc.vo.org.OrgVO
*/
public java.lang.String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.����������֯
* ��������:2019-5-17
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( java.lang.String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_project��Getter����.����������Ŀ����
*  ��������:2019-5-17
* @return nc.vo.pmpub.project.ProjectHeadVO
*/
public java.lang.String getPk_project() {
return this.pk_project;
} 

/**
* ����pk_project��Setter����.����������Ŀ����
* ��������:2019-5-17
* @param newPk_project nc.vo.pmpub.project.ProjectHeadVO
*/
public void setPk_project ( java.lang.String pk_project) {
this.pk_project=pk_project;
} 
 
/**
* ���� project_org��Getter����.����������Ŀ��֯
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getProject_org() {
return this.project_org;
} 

/**
* ����project_org��Setter����.����������Ŀ��֯
* ��������:2019-5-17
* @param newProject_org java.lang.String
*/
public void setProject_org ( java.lang.String project_org) {
this.project_org=project_org;
} 
 
/**
* ���� project_code��Getter����.����������Ŀ����
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getProject_code() {
return this.project_code;
} 

/**
* ����project_code��Setter����.����������Ŀ����
* ��������:2019-5-17
* @param newProject_code java.lang.String
*/
public void setProject_code ( java.lang.String project_code) {
this.project_code=project_code;
} 
 
/**
* ���� project_name��Getter����.����������Ŀ����
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getProject_name() {
return this.project_name;
} 

/**
* ����project_name��Setter����.����������Ŀ����
* ��������:2019-5-17
* @param newProject_name java.lang.String
*/
public void setProject_name ( java.lang.String project_name) {
this.project_name=project_name;
} 
 
/**
* ���� project_class��Getter����.����������Ŀ����
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getProject_class() {
return this.project_class;
} 

/**
* ����project_class��Setter����.����������Ŀ����
* ��������:2019-5-17
* @param newProject_class java.lang.String
*/
public void setProject_class ( java.lang.String project_class) {
this.project_class=project_class;
} 
 
/**
* ���� eps��Getter����.��������eps
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getEps() {
return this.eps;
} 

/**
* ����eps��Setter����.��������eps
* ��������:2019-5-17
* @param newEps java.lang.String
*/
public void setEps ( java.lang.String eps) {
this.eps=eps;
} 
 
/**
* ���� code��Getter����.���������ɵ����
*  ��������:2019-5-17
* @return java.lang.Integer
*/
public java.lang.Integer getCode() {
return this.code;
} 

/**
* ����code��Setter����.���������ɵ����
* ��������:2019-5-17
* @param newCode java.lang.Integer
*/
public void setCode ( java.lang.Integer code) {
this.code=code;
} 
 
/**
* ���� name��Getter����.���������ɵ�����
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getName() {
return this.name;
} 

/**
* ����name��Setter����.���������ɵ�����
* ��������:2019-5-17
* @param newName java.lang.String
*/
public void setName ( java.lang.String name) {
this.name=name;
} 
 
/**
* ���� longitude��Getter����.������������
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getLongitude() {
return this.longitude;
} 

/**
* ����longitude��Setter����.������������
* ��������:2019-5-17
* @param newLongitude java.lang.String
*/
public void setLongitude ( java.lang.String longitude) {
this.longitude=longitude;
} 
 
/**
* ���� latitude��Getter����.��������γ��
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getLatitude() {
return this.latitude;
} 

/**
* ����latitude��Setter����.��������γ��
* ��������:2019-5-17
* @param newLatitude java.lang.String
*/
public void setLatitude ( java.lang.String latitude) {
this.latitude=latitude;
} 
 
/**
* ���� elevation��Getter����.���������߳�
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getElevation() {
return this.elevation;
} 

/**
* ����elevation��Setter����.���������߳�
* ��������:2019-5-17
* @param newElevation java.lang.String
*/
public void setElevation ( java.lang.String elevation) {
this.elevation=elevation;
} 
 
/**
* ���� pk_pipelinepointclass��Getter����.�����������ߵ����
*  ��������:2019-5-17
* @return nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO
*/
public java.lang.String getPk_pipelinepointclass() {
return this.pk_pipelinepointclass;
} 

/**
* ����pk_pipelinepointclass��Setter����.�����������ߵ����
* ��������:2019-5-17
* @param newPk_pipelinepointclass nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO
*/
public void setPk_pipelinepointclass ( java.lang.String pk_pipelinepointclass) {
this.pk_pipelinepointclass=pk_pipelinepointclass;
} 
 
/**
* ���� pk_pressuregrade��Getter����.��������ѹ���ȼ�
*  ��������:2019-5-17
* @return nc.vo.pmbd.bd.pressuregrade.PressuregradeVO
*/
public java.lang.String getPk_pressuregrade() {
return this.pk_pressuregrade;
} 

/**
* ����pk_pressuregrade��Setter����.��������ѹ���ȼ�
* ��������:2019-5-17
* @param newPk_pressuregrade nc.vo.pmbd.bd.pressuregrade.PressuregradeVO
*/
public void setPk_pressuregrade ( java.lang.String pk_pressuregrade) {
this.pk_pressuregrade=pk_pressuregrade;
} 
 
/**
* ���� mpa��Getter����.��������ѹ��MPa
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getMpa() {
return this.mpa;
} 

/**
* ����mpa��Setter����.��������ѹ��MPa
* ��������:2019-5-17
* @param newMpa java.lang.String
*/
public void setMpa ( java.lang.String mpa) {
this.mpa=mpa;
} 
 
/**
* ���� isline��Getter����.������������
*  ��������:2019-5-17
* @return nc.vo.pqm.pipelinepointdatas.Isline
*/
public java.lang.String getIsline() {
return this.isline;
} 

/**
* ����isline��Setter����.������������
* ��������:2019-5-17
* @param newIsline nc.vo.pqm.pipelinepointdatas.Isline
*/
public void setIsline ( java.lang.String isline) {
this.isline=isline;
} 
 
/**
* ���� memo��Getter����.����������ע
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getMemo() {
return this.memo;
} 

/**
* ����memo��Setter����.����������ע
* ��������:2019-5-17
* @param newMemo java.lang.String
*/
public void setMemo ( java.lang.String memo) {
this.memo=memo;
} 
 
/**
* ���� creator��Getter����.���������ύ��
*  ��������:2019-5-17
* @return nc.vo.sm.UserVO
*/
public java.lang.String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.���������ύ��
* ��������:2019-5-17
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( java.lang.String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.���������ύʱ��
*  ��������:2019-5-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.���������ύʱ��
* ��������:2019-5-17
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.������������޸���
*  ��������:2019-5-17
* @return nc.vo.sm.UserVO
*/
public java.lang.String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.������������޸���
* ��������:2019-5-17
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( java.lang.String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifiedtime��Getter����.������������޸�ʱ��
*  ��������:2019-5-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ����modifiedtime��Setter����.������������޸�ʱ��
* ��������:2019-5-17
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ���� vdef1��Getter����.���������Զ�����1
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef1() {
return this.vdef1;
} 

/**
* ����vdef1��Setter����.���������Զ�����1
* ��������:2019-5-17
* @param newVdef1 java.lang.String
*/
public void setVdef1 ( java.lang.String vdef1) {
this.vdef1=vdef1;
} 
 
/**
* ���� vdef2��Getter����.���������Զ�����2
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef2() {
return this.vdef2;
} 

/**
* ����vdef2��Setter����.���������Զ�����2
* ��������:2019-5-17
* @param newVdef2 java.lang.String
*/
public void setVdef2 ( java.lang.String vdef2) {
this.vdef2=vdef2;
} 
 
/**
* ���� vdef3��Getter����.���������Զ�����3
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef3() {
return this.vdef3;
} 

/**
* ����vdef3��Setter����.���������Զ�����3
* ��������:2019-5-17
* @param newVdef3 java.lang.String
*/
public void setVdef3 ( java.lang.String vdef3) {
this.vdef3=vdef3;
} 
 
/**
* ���� vdef4��Getter����.���������Զ�����4
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef4() {
return this.vdef4;
} 

/**
* ����vdef4��Setter����.���������Զ�����4
* ��������:2019-5-17
* @param newVdef4 java.lang.String
*/
public void setVdef4 ( java.lang.String vdef4) {
this.vdef4=vdef4;
} 
 
/**
* ���� vdef5��Getter����.���������Զ�����5
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef5() {
return this.vdef5;
} 

/**
* ����vdef5��Setter����.���������Զ�����5
* ��������:2019-5-17
* @param newVdef5 java.lang.String
*/
public void setVdef5 ( java.lang.String vdef5) {
this.vdef5=vdef5;
} 
 
/**
* ���� vdef6��Getter����.���������Զ�����6
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef6() {
return this.vdef6;
} 

/**
* ����vdef6��Setter����.���������Զ�����6
* ��������:2019-5-17
* @param newVdef6 java.lang.String
*/
public void setVdef6 ( java.lang.String vdef6) {
this.vdef6=vdef6;
} 
 
/**
* ���� vdef7��Getter����.���������Զ�����7
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef7() {
return this.vdef7;
} 

/**
* ����vdef7��Setter����.���������Զ�����7
* ��������:2019-5-17
* @param newVdef7 java.lang.String
*/
public void setVdef7 ( java.lang.String vdef7) {
this.vdef7=vdef7;
} 
 
/**
* ���� vdef8��Getter����.���������Զ�����8
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef8() {
return this.vdef8;
} 

/**
* ����vdef8��Setter����.���������Զ�����8
* ��������:2019-5-17
* @param newVdef8 java.lang.String
*/
public void setVdef8 ( java.lang.String vdef8) {
this.vdef8=vdef8;
} 
 
/**
* ���� vdef9��Getter����.���������Զ�����9
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef9() {
return this.vdef9;
} 

/**
* ����vdef9��Setter����.���������Զ�����9
* ��������:2019-5-17
* @param newVdef9 java.lang.String
*/
public void setVdef9 ( java.lang.String vdef9) {
this.vdef9=vdef9;
} 
 
/**
* ���� vdef10��Getter����.���������Զ�����10
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef10() {
return this.vdef10;
} 

/**
* ����vdef10��Setter����.���������Զ�����10
* ��������:2019-5-17
* @param newVdef10 java.lang.String
*/
public void setVdef10 ( java.lang.String vdef10) {
this.vdef10=vdef10;
} 
 
/**
* ���� vdef11��Getter����.���������Զ�����11
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef11() {
return this.vdef11;
} 

/**
* ����vdef11��Setter����.���������Զ�����11
* ��������:2019-5-17
* @param newVdef11 java.lang.String
*/
public void setVdef11 ( java.lang.String vdef11) {
this.vdef11=vdef11;
} 
 
/**
* ���� vdef12��Getter����.���������Զ�����12
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef12() {
return this.vdef12;
} 

/**
* ����vdef12��Setter����.���������Զ�����12
* ��������:2019-5-17
* @param newVdef12 java.lang.String
*/
public void setVdef12 ( java.lang.String vdef12) {
this.vdef12=vdef12;
} 
 
/**
* ���� vdef13��Getter����.���������Զ�����13
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef13() {
return this.vdef13;
} 

/**
* ����vdef13��Setter����.���������Զ�����13
* ��������:2019-5-17
* @param newVdef13 java.lang.String
*/
public void setVdef13 ( java.lang.String vdef13) {
this.vdef13=vdef13;
} 
 
/**
* ���� vdef14��Getter����.���������Զ�����14
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef14() {
return this.vdef14;
} 

/**
* ����vdef14��Setter����.���������Զ�����14
* ��������:2019-5-17
* @param newVdef14 java.lang.String
*/
public void setVdef14 ( java.lang.String vdef14) {
this.vdef14=vdef14;
} 
 
/**
* ���� vdef15��Getter����.���������Զ�����15
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef15() {
return this.vdef15;
} 

/**
* ����vdef15��Setter����.���������Զ�����15
* ��������:2019-5-17
* @param newVdef15 java.lang.String
*/
public void setVdef15 ( java.lang.String vdef15) {
this.vdef15=vdef15;
} 
 
/**
* ���� vdef16��Getter����.���������Զ�����16
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef16() {
return this.vdef16;
} 

/**
* ����vdef16��Setter����.���������Զ�����16
* ��������:2019-5-17
* @param newVdef16 java.lang.String
*/
public void setVdef16 ( java.lang.String vdef16) {
this.vdef16=vdef16;
} 
 
/**
* ���� vdef17��Getter����.���������Զ�����17
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef17() {
return this.vdef17;
} 

/**
* ����vdef17��Setter����.���������Զ�����17
* ��������:2019-5-17
* @param newVdef17 java.lang.String
*/
public void setVdef17 ( java.lang.String vdef17) {
this.vdef17=vdef17;
} 
 
/**
* ���� vdef18��Getter����.���������Զ�����18
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef18() {
return this.vdef18;
} 

/**
* ����vdef18��Setter����.���������Զ�����18
* ��������:2019-5-17
* @param newVdef18 java.lang.String
*/
public void setVdef18 ( java.lang.String vdef18) {
this.vdef18=vdef18;
} 
 
/**
* ���� vdef19��Getter����.���������Զ�����19
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef19() {
return this.vdef19;
} 

/**
* ����vdef19��Setter����.���������Զ�����19
* ��������:2019-5-17
* @param newVdef19 java.lang.String
*/
public void setVdef19 ( java.lang.String vdef19) {
this.vdef19=vdef19;
} 
 
/**
* ���� vdef20��Getter����.���������Զ�����20
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef20() {
return this.vdef20;
} 

/**
* ����vdef20��Setter����.���������Զ�����20
* ��������:2019-5-17
* @param newVdef20 java.lang.String
*/
public void setVdef20 ( java.lang.String vdef20) {
this.vdef20=vdef20;
} 
 
/**
* ���� vdef21��Getter����.���������Զ�����21
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef21() {
return this.vdef21;
} 

/**
* ����vdef21��Setter����.���������Զ�����21
* ��������:2019-5-17
* @param newVdef21 java.lang.String
*/
public void setVdef21 ( java.lang.String vdef21) {
this.vdef21=vdef21;
} 
 
/**
* ���� vdef22��Getter����.���������Զ�����22
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef22() {
return this.vdef22;
} 

/**
* ����vdef22��Setter����.���������Զ�����22
* ��������:2019-5-17
* @param newVdef22 java.lang.String
*/
public void setVdef22 ( java.lang.String vdef22) {
this.vdef22=vdef22;
} 
 
/**
* ���� vdef23��Getter����.���������Զ�����23
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef23() {
return this.vdef23;
} 

/**
* ����vdef23��Setter����.���������Զ�����23
* ��������:2019-5-17
* @param newVdef23 java.lang.String
*/
public void setVdef23 ( java.lang.String vdef23) {
this.vdef23=vdef23;
} 
 
/**
* ���� vdef24��Getter����.���������Զ�����24
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef24() {
return this.vdef24;
} 

/**
* ����vdef24��Setter����.���������Զ�����24
* ��������:2019-5-17
* @param newVdef24 java.lang.String
*/
public void setVdef24 ( java.lang.String vdef24) {
this.vdef24=vdef24;
} 
 
/**
* ���� vdef25��Getter����.���������Զ�����25
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef25() {
return this.vdef25;
} 

/**
* ����vdef25��Setter����.���������Զ�����25
* ��������:2019-5-17
* @param newVdef25 java.lang.String
*/
public void setVdef25 ( java.lang.String vdef25) {
this.vdef25=vdef25;
} 
 
/**
* ���� vdef26��Getter����.���������Զ�����26
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef26() {
return this.vdef26;
} 

/**
* ����vdef26��Setter����.���������Զ�����26
* ��������:2019-5-17
* @param newVdef26 java.lang.String
*/
public void setVdef26 ( java.lang.String vdef26) {
this.vdef26=vdef26;
} 
 
/**
* ���� vdef27��Getter����.���������Զ�����27
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef27() {
return this.vdef27;
} 

/**
* ����vdef27��Setter����.���������Զ�����27
* ��������:2019-5-17
* @param newVdef27 java.lang.String
*/
public void setVdef27 ( java.lang.String vdef27) {
this.vdef27=vdef27;
} 
 
/**
* ���� vdef28��Getter����.���������Զ�����28
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef28() {
return this.vdef28;
} 

/**
* ����vdef28��Setter����.���������Զ�����28
* ��������:2019-5-17
* @param newVdef28 java.lang.String
*/
public void setVdef28 ( java.lang.String vdef28) {
this.vdef28=vdef28;
} 
 
/**
* ���� vdef29��Getter����.���������Զ�����29
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef29() {
return this.vdef29;
} 

/**
* ����vdef29��Setter����.���������Զ�����29
* ��������:2019-5-17
* @param newVdef29 java.lang.String
*/
public void setVdef29 ( java.lang.String vdef29) {
this.vdef29=vdef29;
} 
 
/**
* ���� vdef30��Getter����.���������Զ�����30
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef30() {
return this.vdef30;
} 

/**
* ����vdef30��Setter����.���������Զ�����30
* ��������:2019-5-17
* @param newVdef30 java.lang.String
*/
public void setVdef30 ( java.lang.String vdef30) {
this.vdef30=vdef30;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2019-5-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2019-5-17
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("pqm.pipelinepointdatas");
    }
   }
    
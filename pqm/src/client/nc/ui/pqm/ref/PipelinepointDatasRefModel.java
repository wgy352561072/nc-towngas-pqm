package nc.ui.pqm.ref;

import nc.ui.bd.ref.AbstractRefModel;

public class PipelinepointDatasRefModel extends AbstractRefModel {
	
	public PipelinepointDatasRefModel(){
		super();
	}
	
	@Override
	public String[] getFieldCode() {//�������ݵ��ֶα���
		return new String[]{
				"code",
				"name"
		};
	}
	
	@Override
	public String[] getFieldName() {//�������ݵ��ֶ�����
		return new String[]{
				"�ɵ����",
				"�ɵ�����"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//��Ҫ���صĲ������ݵ��ֶα���
		//lxiaofan
		//��Ҫ���漰�������õ��ֶη��룬������getFieldCode�е��ֶ�
		//����˴���Ӧ�ý�getFatherField�����е��ֶκ�getChildField�����е��ֶη���
		return new String[]{"pk_pipelinepointdatas"};
	}
	
	@Override
	public String getTableName() {//�������ݵı���
		return "pqm_pipelinepointdatas";
	}
	
	@Override
	public String getPkFieldCode() {//�������ݶ�Ӧ�������
		return "pk_pipelinepointdatas";
	}
	
	@Override
	public String getRefCodeField() {//���ն�Ӧ�ı����ֶ�
		return "code";
	}
	
	@Override
	public String getRefNameField() {//���ն�Ӧ�������ֶ�
		return "name";
	}
	
	@Override
	public String getWherePart() {//�������ݵĹ�������
//		return super.getWherePart();
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " dr = 0 ";
		}else{
			wherePart += " and dr = 0 ";
		}
		return wherePart;
	}
	
}

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
 *  ��������:2019-4-9
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class PipelinepointdatasVO extends SuperVO {
	
/**
*ʱ���
*/
public static final String TS="ts";;
    
    
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2019-4-9
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return (UFDateTime)this.getAttributeValue(PipelinepointdatasVO.TS);
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2019-4-9
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.setAttributeValue(PipelinepointdatasVO.TS,ts);
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("pqm.pipelinepointdatas");
    }
   }
    
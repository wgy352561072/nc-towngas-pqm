package nc.bs.pqm.pipelinepointdatas.rules;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uif.pub.IUifService;
import nc.uif.pub.exception.UifException;
import nc.vo.pqm.pipelinepointdatas.PipelinepointdatasVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * ���ߵ����ݱ����ظ�У��
 * @author wugy
 * @version 2019-04-10 16:11:26
 *
 */
public class PipelinepointDatasCheckCodeRule implements
		IRule<PipelinepointdatasVO> {

	@Override
	public void process(PipelinepointdatasVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("���ݲ���Ϊ�գ�");
		}
		for (int i = 0; i < vos.length; i++) {
			PipelinepointdatasVO vo = vos[i];
			Object code = vo.getAttributeValue("code");
			if (code == null) {
				ExceptionUtils.wrappBusinessException("���ߵ����ݱ��벻��Ϊ�գ�");
			}
			Object pk_pipelinepointdatas = vo
					.getAttributeValue("pk_pipelinepointdatas");
			//vo.setAttributeValue("pk_project", "1002A910000000NOZORS");
			Object pk_projectobj = vo.getAttributeValue("pk_project");
			if (pk_projectobj == null) {
				continue;
			}
			String pk_project = (String) pk_projectobj;
			String existpk = null;
			IUifService service = NCLocator.getInstance().lookup(
					IUifService.class);
			if (pk_pipelinepointdatas == null) {// �����ĵ���
				try {
					existpk = (String) service.findColValue(
							"pqm_pipelinepointdatas", "pk_pipelinepointdatas",
							"code = " + code + " and pk_project = '"
									+ pk_project + "' and nvl(dr,0) = 0");
				} catch (UifException e) {
					e.printStackTrace();
				}
			} else {// �޸ĵĵ���
				try {
					existpk = (String) service.findColValue(
							"pqm_pipelinepointdatas", "pk_pipelinepointdatas",
							"code = " + code
									+ " and pk_pipelinepointdatas <> '"
									+ pk_pipelinepointdatas.toString()
									+ "' and pk_project = '" + pk_project
									+ "'  and nvl(dr,0) = 0");
				} catch (UifException e) {
					e.printStackTrace();
				}
			}
			if (existpk != null) {
				ExceptionUtils.wrappBusinessException("���ߵ����ݱ���:" + code
						+ "�����ظ���");
			}
		}
	}
}

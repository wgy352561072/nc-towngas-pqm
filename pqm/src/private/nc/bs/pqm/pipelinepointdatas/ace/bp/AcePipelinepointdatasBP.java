package nc.bs.pqm.pipelinepointdatas.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.pqm.pipelinepointdatas.PipelinepointdatasVO;

public class AcePipelinepointdatasBP {

	public PipelinepointdatasVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<PipelinepointdatasVO>(PipelinepointdatasVO.class).query(querySheme,
				null);
	}
	
}

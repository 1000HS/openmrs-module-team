package org.openmrs.module.teammodule.api;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.teammodule.TeamLog;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeamLogService extends OpenmrsService {

	public void saveTeamLog(TeamLog teamLog);
	
	public TeamLog getTeamLog(int id);
	
	public List<TeamLog> getAllLogs(int pageIndex);
	
	public void purgeTeamLog(TeamLog teamLog);
	
	public List<TeamLog> searchTeamLogByTeam(int team,int pageIndex);

	public TeamLog getTeamLog(String uuid);
}
package org.openmrs.module.teammodule.api.db;

import java.util.List;

import org.openmrs.module.teammodule.TeamLog;

public interface TeamLogDAO {

	public void saveTeamLog(TeamLog teamLog);
	
	public TeamLog getTeamLog(Integer id);
	
	public List<TeamLog> getAllLogs(Integer offset, Integer pageSize);
	
	public void purgeTeamLog(TeamLog teamLog);

	public void updateTeamLog(TeamLog teamLog);
	
	public List<TeamLog> searchTeamLogByTeam(Integer team, Integer offset, Integer pageSize);

	public TeamLog getTeamLog(String uuid);
}

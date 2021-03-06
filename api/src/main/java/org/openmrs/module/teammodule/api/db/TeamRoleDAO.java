package org.openmrs.module.teammodule.api.db;

import java.util.List;

import org.openmrs.module.teammodule.TeamRole;

public interface TeamRoleDAO {

	public void saveTeamRole(TeamRole TeamRole);
	
	public void updateTeamRole(TeamRole teamRole);
	
	public TeamRole getTeamRoleById(Integer id);
	
	public List<TeamRole> getAllTeamRole(boolean ownsTeam, boolean voided, Integer offset, Integer pageSize);
	
	public void purgeTeamRole(TeamRole TeamRole);
	
	public List<TeamRole> searchTeamRoleByRole(String role);
	
	public TeamRole getTeamRoleByUuid(String uuid);

	public List<TeamRole> getSubTeamRoles(Integer teamMemberId);

	public List<TeamRole> searchTeamRoleReportBy(Integer id);
}

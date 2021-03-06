package org.openmrs.module.teammodule.api;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.teammodule.TeamRole;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeamRoleService extends OpenmrsService {

	public void saveTeamRole(TeamRole teamRole);
	
	public void updateTeamRole(TeamRole teamRole);

	public TeamRole getTeamRoleById(Integer id);
	
	public List<TeamRole> getAllTeamRole(boolean ownsTeam, boolean voided, Integer offset, Integer pageSize);
	
	public void purgeTeamRole(TeamRole TeamRole);
	
	public List<TeamRole> searchTeamRoleByRole(String role);
		
	public TeamRole getTeamRoleByUuid(String uuid);

	public List<TeamRole> getSubTeamRoles(Integer teamMemberId);		

	public List<TeamRole> searchTeamRoleReportBy(Integer id);
}

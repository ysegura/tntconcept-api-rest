/**
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
 * Copyright (C) 2007 Autentia Real Bussiness Solution S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package autentia.apiRestTnt.controller;

import autentia.apiRestTnt.model.ProjectRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import autentia.apiRestTnt.model.Project;
import autentia.apiRestTnt.services.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

	private ProjectService projectService;	
	
	@Autowired
	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}

	@GetMapping("/project/{projectId}")
	public Project getProjectById(@PathVariable("projectId") Integer projectId) {
		return projectService.getProjectById(projectId);
	}

	@GetMapping("/project/{projectId}/roles")
	public List<ProjectRole> getProjectRoles(@PathVariable("projectId") Integer projectId) {
		return projectService.getProjectRolesByProjectId(projectId);
	}

}

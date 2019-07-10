package foodpanda.webapp.business.impl;

import org.springframework.stereotype.Service;

import foodpanda.webapp.business.RoleService;
import foodpanda.webapp.business.model.Role;

@Service
public class JPARoleService extends JPACRUDService<Long, Role> implements RoleService {

}

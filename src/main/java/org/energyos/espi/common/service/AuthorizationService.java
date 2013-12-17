package org.energyos.espi.common.service;

import org.energyos.espi.common.domain.Authorization;
import org.energyos.espi.common.domain.Subscription;
import org.energyos.espi.common.models.atom.EntryType;
import org.energyos.espi.common.utils.EntryTypeIterator;
import org.energyos.espi.common.utils.ExportFilter;

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface AuthorizationService {
	// residue from random stories
	public List<Authorization> findAllByRetailCustomerId(Long retailCustomerId);

	public Authorization createAuthorization(Subscription subscription,
			String accessToken);

	public Authorization findByState(String state);

	public List<Authorization> findAll();

	public String feedFor(List<Authorization> authorizations);

	public String entryFor(Authorization authorization);

	public Authorization findByURI(String uri);


	// persistence management services
	public void persist(Authorization authorization);

	public void merge(Authorization authorization);

	// accessor services
        public Authorization findById(Long authorizationId);

	public EntryType find(Long retailCustomerId, Long authorizationId);

	public EntryTypeIterator find(Long retailCustomerId);

	public void add(Authorization authorization);

	public void delete(Authorization authorization);

	// import-exportResource services
	public Authorization importResource(InputStream stream);

}

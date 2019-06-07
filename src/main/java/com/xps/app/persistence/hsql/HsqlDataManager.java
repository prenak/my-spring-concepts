package com.xps.app.persistence.hsql;

import org.hsqldb.Server;
import org.hsqldb.util.DatabaseManagerSwing;

public class HsqlDataManager {
	
	private Server 	hsqlServer;
	
	// HSQL properties
	private String 	dbName;
	private String 	url;
	private String 	dbHost;
	private int		port;
	
	public void init() {
		hsqlServer = new Server();
		hsqlServer.setDatabaseName(0, this.dbName);
		hsqlServer.setAddress(this.dbHost);
		hsqlServer.setPort(this.port);
		hsqlServer.start();
		
		DatabaseManagerSwing.main(new String[] { "--url", this.url, "--user", "sa", "--password", "" });
	}
	
	public void close() {
		this.hsqlServer.stop();
	}

	public void setHsqlServer(Server hsqlServer) {
		this.hsqlServer = hsqlServer;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

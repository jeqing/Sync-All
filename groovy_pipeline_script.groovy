node {
  stage 'Run JMeter Test'
  bat 'C:\JMeter\apache-jmeter-3.2\bin\jmeter.bat -n -t C:\Users\Christina\Desktop\Stats\Sunjeet\CK\Sync_All\Trak_a_fresh_sync_all_2_workloads_CK.jmx -l test.jtl'
}
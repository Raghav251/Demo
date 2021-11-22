--- 
- 
  hosts: all
  remote_user: ubuntu
  tasks: 
    - 
      action: ec2_facts
      name: "Gather facts"
    - 
      local_action: 
        instance_ids: "{{i-0610d09d5082abeec}}"
        module: ec2
        region: ap-south-1
        state: stopped
      name: "Stop myserver instance"
